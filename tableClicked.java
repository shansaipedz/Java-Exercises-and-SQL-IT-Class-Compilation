// students
int[] selectRow = table_students.getSelectedRows();
       String studid,studname,studadd,studcourse,studgender,studyear;
       studid=(String) table_students.getValueAt(selectRow[0],0);
       studname=(String) table_students.getValueAt(selectRow[0],1);
       studadd=(String) table_students.getValueAt(selectRow[0],2);
       studcourse=(String) table_students.getValueAt(selectRow[0],3);
       studgender=(String) table_students.getValueAt(selectRow[0],4);
       studyear=(String) table_students.getValueAt(selectRow[0],5);

       txt_studID.setText(studid);
       txt_studName.setText(studname);
       txt_studAdd.setText(studadd);
       txt_studCourse.setText(studcourse);
       txt_studGender.setText(studgender);
       txt_studYear.setText(studyear);

// teachers
  int[] selectRow = table_teachers.getSelectedRows();
       String teacherName,Department,teacherAdd,teacherContact,teacherStatus;
       tid=(String) table_teachers.getValueAt(selectRow[0],0);
       teacherName=(String) table_teachers.getValueAt(selectRow[0],1);
       Department=(String) table_teachers.getValueAt(selectRow[0],2);
       teacherAdd=(String) table_teachers.getValueAt(selectRow[0],3);
       teacherContact=(String) table_teachers.getValueAt(selectRow[0],4);
       teacherStatus=(String) table_teachers.getValueAt(selectRow[0],5);

       txt_teacherID.setText(tid);
       txt_teacherName.setText(teacherName);
       txt_department.setText(Department);
       txt_teacherAdd.setText(teacherAdd);
       txt_teacherContact.setText(teacherContact);
       txt_teacherStatus.setText(teacherStatus);
// subjects
int[] selectRow = table_subjects.getSelectedRows();
       String studid,studname,studadd,studcourse,studgender,studyear;
       studid=(String) table_subjects.getValueAt(selectRow[0],0);
       studname=(String) table_subjects.getValueAt(selectRow[0],1);
       studadd=(String) table_subjects.getValueAt(selectRow[0],2);
       studcourse=(String) table_subjects.getValueAt(selectRow[0],3);
       studgender=(String) table_subjects.getValueAt(selectRow[0],4);

       txt_subjID.setText(studid);
       txt_subjCode.setText(studname);
       txt_subjDesc.setText(studadd);
       txt_subjUnits.setText(studcourse);
       txt_subjSched.setText(studgender);
