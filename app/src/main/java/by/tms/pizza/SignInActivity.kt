package by.tms.pizza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.sign_in_actvity.*
import kotlinx.android.synthetic.main.sign_in_actvity.outlinedNickname
import kotlinx.android.synthetic.main.sign_in_actvity.password
import kotlinx.android.synthetic.main.sign_up_layout.*

class SignInActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_actvity)

        signInButton.setOnClickListener(this)
        signUpButton.setOnClickListener(this)

//        telephoneNumberOrNickname.addTextChangedListener(object : TextWatcher {
//            override fun afterTextChanged(s: Editable?) {
//                if (s.toString().isEmpty()) {
//                    outlinedNickname.error = "Telephone number cannot be empty"
//                } else
//                    outlinedNickname.error = ""
//            }
//
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//        })


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            signInButton.id -> {
                val list = UserList.instance.listOfUsers
                for (i in 0 until list.size) {
                    if ((list[i].number.equals(telephoneNumberOrNickname.text.toString().toInt()) || list[i].nickname.equals(
                            nickname.text.toString()
                        )) && list[i].password.equals(password.text.toString())
                    ) {
                        Toast.makeText(this, "Welcome, ${list[i].nickname}!", Toast.LENGTH_SHORT)
                            .show()
                        startActivity(Intent(this, MainActivity::class.java))
                    } else
                        Toast.makeText(this, "User not found", Toast.LENGTH_SHORT).show()
                }

            }
            signUpButton.id -> {
                startActivity(Intent(this, SignUpActivity::class.java))
            }

        }
    }


}


