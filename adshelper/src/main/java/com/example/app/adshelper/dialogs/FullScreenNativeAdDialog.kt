package com.example.app.adshelper.dialogs

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.*
import android.widget.Toast
import com.example.app.adshelper.*
import com.example.app.adshelper.databinding.DialogFullScreenNativeAdBinding
import com.example.app.adshelper.visible

class FullScreenNativeAdDialog(
    private val activity: Activity,
    private val onDialogDismiss: () -> Unit = {}
) : Dialog(activity, R.style.full_screen_dialog) {

    private val TAG: String = javaClass.simpleName

    private var mBinding: DialogFullScreenNativeAdBinding

    companion object {

        @SuppressLint("StaticFieldLeak")
        private var testDialog: FullScreenNativeAdDialog? = null

        val isDialogShowing: Boolean
            get() {
                return testDialog != null && testDialog?.isShowing ?: false
            }
    }

    init {
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        mBinding = DialogFullScreenNativeAdBinding.inflate(LayoutInflater.from(context))
        setContentView(mBinding.root)

        window?.let {

            it.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//            it.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)

            ///////////   Animation  ////////
            val lp = WindowManager.LayoutParams()
            lp.copyFrom(it.attributes)
            lp.width = WindowManager.LayoutParams.MATCH_PARENT
            lp.height = WindowManager.LayoutParams.MATCH_PARENT
            lp.gravity = Gravity.CENTER
            lp.windowAnimations = R.style.dialog_animation
            it.attributes = lp

        }

        setCancelable(false)
        setCanceledOnTouchOutside(false)

        setOnDismissListener {
            mBinding.flNativeAdPlaceHolder.removeAllViews()
        }

        mBinding.ivCloseAd.setOnClickListener {
            if (this != null && this.isShowing) {
                this.dismiss()
            }
            onDialogDismiss.invoke()
        }
    }

    fun showFullScreenNativeAdDialog(checked: Boolean) {
        if (NativeAdvancedModelHelper.getNativeAd != null && !activity.isFinishing && !isShowing && activity.isOnline) {
            Log.i(TAG, "showFullScreenNativeAdDialog: ")

            mBinding.ivCloseAd.visible

            NativeAdvancedModelHelper(activity).loadNativeAdvancedAd(
                fSize = NativeAdsSize.FullScreen,
                fLayout = mBinding.flNativeAdPlaceHolder,
                isAddVideoOptions = checked,
                isAdLoaded = { isNeedToRemoveCloseButton ->
                    if (!isNeedToRemoveCloseButton) {
                        mBinding.ivCloseAd.visible
                    } else {
                        mBinding.ivCloseAd.gone
                    }
                    mBinding.flNativeAdPlaceHolder.visible
                },
                onClickAdClose = {
                    mBinding.ivCloseAd.performClick()
                }
            )
            testDialog = this
            isInterstitialAdShow = true
            show()
        } else if (!activity.isOnline) {
            Toast.makeText(activity, "check your internet connection", Toast.LENGTH_SHORT).show()
        } else if (NativeAdvancedModelHelper.getNativeAd != null) {
            Toast.makeText(activity, "native ad not load", Toast.LENGTH_SHORT).show()
        }
    }
}