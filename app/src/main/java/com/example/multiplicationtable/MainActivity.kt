package com.example.multiplicationtable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btMultipleOne.setOnClickListener{

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fcMultiplication,MultiplicationByOne.newInstance("",""))
                .addToBackStack(null)
                .commit()
        }
        btMultipleTwo.setOnClickListener{

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fcMultiplication,MultiplicationByTwo.newInstance("",""))
                .addToBackStack(null)
                .commit()
        }
        btMultipleThree.setOnClickListener{

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fcMultiplication,MultiplicationByThree.newInstance("",""))
                .addToBackStack(null)
                .commit()
        }
        btMultipleFour.setOnClickListener{

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fcMultiplication,MultiplicationByFour.newInstance("",""))
                .addToBackStack(null)
                .commit()
        }
        btMultipleFive.setOnClickListener{

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fcMultiplication,MultiplicationByFive.newInstance("",""))
                .addToBackStack(null)
                .commit()
        }
        btMultipleSix.setOnClickListener{

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fcMultiplication,MultiplicationBySix.newInstance("",""))
                .addToBackStack(null)
                .commit()
        }
        btMultipleSeven.setOnClickListener{

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fcMultiplication,MultiplicationBySeven.newInstance("",""))
                .addToBackStack(null)
                .commit()
        }
        btMultipleEight.setOnClickListener{

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fcMultiplication,MultiplicationByEight.newInstance("",""))
                .addToBackStack(null)
                .commit()
        }
        btMultipleNine.setOnClickListener{

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fcMultiplication,MultiplicationByNine.newInstance("",""))
                .addToBackStack(null)
                .commit()
        }
        btMultipleTen.setOnClickListener{

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fcMultiplication,MultiplicationByTen.newInstance("",""))
                .addToBackStack(null)
                .commit()
        }
    }
}