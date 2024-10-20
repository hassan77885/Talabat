class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailLoginBtn = findViewById<Button>(R.id.btnEmailLogin)
        emailLoginBtn.setOnClickListener {
            startActivity(Intent(this, EmailLoginActivity::class.java))
        }

        val googleLoginBtn = findViewById<Button>(R.id.btnGoogleLogin)
        // Add Google login logic here

        val facebookLoginBtn = findViewById<Button>(R.id.btnFacebookLogin)
        // Add Facebook login logic here

        val appleLoginBtn = findViewById<Button>(R.id.btnAppleLogin)
        // Add Apple login logic here

        val createAccountTxt = findViewById<TextView>(R.id.txtCreateAccount)
        createAccountTxt.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}
