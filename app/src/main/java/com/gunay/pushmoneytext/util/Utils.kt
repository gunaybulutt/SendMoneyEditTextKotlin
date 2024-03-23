package com.gunay.pushmoneytext.util

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

fun EditText.otomatikNokta(){
    this.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

        override fun afterTextChanged(s: Editable?) {
            this@otomatikNokta.removeTextChangedListener(this)

            val cleanString = s.toString().replace(".", "")
            val formatted = StringBuilder()
            var count = 0

            for (i in cleanString.indices.reversed()) {
                formatted.insert(0, cleanString[i])
                count++
                if (count % 3 == 0 && i != 0) {
                    formatted.insert(0, ".")
                }
            }

            this@otomatikNokta.setText(formatted.toString())
            this@otomatikNokta.setSelection(this@otomatikNokta.text.length)

            this@otomatikNokta.addTextChangedListener(this)
        }
    })
}




