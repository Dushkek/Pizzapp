package by.tms.pizza

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.sign_up_layout.*
import kotlinx.android.synthetic.main.sign_up_layout.password

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up_layout)

        registerButton.setOnClickListener {
            if (nickname.text!!.isNotEmpty() && telephoneNumber.text!!.isNotEmpty() && address.text!!.isNotEmpty() && password.text!!.isNotEmpty()) {
                UserList.instance.listOfUsers.add(
                    User(
                        nickname.text.toString(),
                        telephoneNumber.text.toString().toInt(),
                        password.text.toString(),
                        address.text.toString()
                    )
                )
                Toast.makeText(this, "You are successfully registered", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, SignInActivity::class.java))
            } else
                Toast.makeText(this, "Fill full data please", Toast.LENGTH_SHORT).show()
        }


    }
}