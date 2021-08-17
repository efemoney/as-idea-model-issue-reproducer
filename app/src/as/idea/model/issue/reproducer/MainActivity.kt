package `as`.idea.model.issue.reproducer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val list = buildList {
      add("one")
      add("two")
    }
  }
}

sealed interface Sealed {
  data class A(val b: String) : Sealed
  object B : Sealed
}
