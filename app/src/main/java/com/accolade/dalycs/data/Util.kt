package com.accolade.dalycs.data

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

open class Util {

    @RequiresApi(Build.VERSION_CODES.O)
    open val todaysDate: LocalDate = LocalDate.now()

}