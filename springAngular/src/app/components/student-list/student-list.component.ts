import { Component, OnInit } from '@angular/core';
import { STUDENTS } from '../../../students';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrl: './student-list.component.css'
})
export class StudentListComponent implements OnInit{
  students:any=[];

  ngOnInit(): void {
      this.students=STUDENTS;
  }
}
