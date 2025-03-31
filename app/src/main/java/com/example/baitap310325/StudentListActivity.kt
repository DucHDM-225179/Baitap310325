package com.example.baitap310325

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class StudentListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        val students = mutableListOf<StudentModel>()
        repeat(10) {
            students.add(StudentModel(
                "Student $it",
                "SV $it",
                R.drawable.delete_btn
            ))
        }

        val adapter = StudentAdapter(students)
        val listStudent = findViewById<ListView>(R.id.list_students)
        listStudent.adapter = adapter
    }
}