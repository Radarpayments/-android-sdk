package net.payrdr.mobile.payment.sdk.test

import net.payrdr.mobile.payment.sdk.form.model.CameraScannerOptions
import net.payrdr.mobile.payment.sdk.form.model.CardDeleteOptions
import net.payrdr.mobile.payment.sdk.form.model.CardSaveOptions
import net.payrdr.mobile.payment.sdk.form.model.HolderInputOptions
import net.payrdr.mobile.payment.sdk.form.model.NfcScannerOptions
import net.payrdr.mobile.payment.sdk.form.model.PaymentConfig
import net.payrdr.mobile.payment.sdk.form.model.Theme
import java.util.Locale
import java.util.UUID

object PaymentConfigTestProvider {

    fun defaultConfig(): PaymentConfig = PaymentConfig(
        order = UUID.randomUUID().toString(),
        uuid = UUID.randomUUID().toString(),
        timestamp = System.currentTimeMillis(),
        buttonText = null,
        locale = Locale.getDefault(),
        cards = emptySet(),
        cardSaveOptions = CardSaveOptions.HIDE,
        holderInputOptions = HolderInputOptions.HIDE,
        cameraScannerOptions = CameraScannerOptions.ENABLED,
        theme = Theme.SYSTEM,
        nfcScannerOptions = NfcScannerOptions.ENABLED,
        bindingCVCRequired = true,
        cardDeleteOptions = CardDeleteOptions.NO_DELETE
    )
}
