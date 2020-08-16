/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package com.google.android.gms.ads.identifier

import android.content.Context
import com.google.android.gms.common.GooglePlayServicesNotAvailableException

@Suppress("UNUSED_PARAMETER")
class AdvertisingIdClient {
    class Info {
        val id: String = ""
    }

    companion object {
        fun getAdvertisingIdInfo(context: Context): AdvertisingIdClient.Info {
            throw GooglePlayServicesNotAvailableException(1)
        }
    }
}
