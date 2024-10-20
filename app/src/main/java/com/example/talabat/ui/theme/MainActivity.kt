class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    // Load Home Fragment
                    true
                }
                R.id.nav_search -> {
                    // Load Search Fragment
                    true
                }
                R.id.nav_orders -> {
                    // Load Orders Fragment
                    true
                }
                R.id.nav_account -> {
                    // Load Account Fragment
                    true
                }
                else -> false
            }
        }
    }
}
