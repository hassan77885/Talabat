class EmailLoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_login)

        val loginBtn = findViewById<Button>(R.id.btnLogin)
        loginBtn.setOnClickListener {
            // Add authentication logic here
            startActivity(Intent(this, MainActivity::class.java)) // Redirect to main activity after login
        }

        val forgotPasswordTxt = findViewById<TextView>(R.id.txtForgotPassword)
        forgotPasswordTxt.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }
    }
}
