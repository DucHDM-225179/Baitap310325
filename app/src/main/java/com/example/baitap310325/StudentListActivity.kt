package com.example.baitap310325

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class StudentListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        val students = mutableListOf<StudentModel>()
        repeat(2) {
            students.add(StudentModel(
                "Student $it",
                "SV $it",
                R.drawable.delete_btn
            ))
        }

        val listStudent = findViewById<ListView>(R.id.list_students)
        listStudent.adapter = StudentAdapter(students)

        val btn = findViewById<Button>(R.id.button)
        val hoteninput = findViewById<EditText>(R.id.hoteninput)
        val mssvinput = findViewById<EditText>(R.id.mssvinput)
        btn.setOnClickListener{
            val hoTen = hoteninput.text
            val mssv = mssvinput.text
            if (hoTen.isEmpty() || hoTen.isBlank()) {
                return@setOnClickListener
            }
            if (mssv.isEmpty() || mssv.isBlank()) {
                return@setOnClickListener
            }
            students.add(0, StudentModel(
                hoTen.toString(), mssv.toString(), R.drawable.delete_btn
            ))
            listStudent.adapter = StudentAdapter(students)
        }
    }
}