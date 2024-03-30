package model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Tip(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @StringRes val dayRes: Int,
    @DrawableRes val imageRes: Int
)