package com.hh.resultmap;

import com.hh.dao.Student;
import lombok.Data;

@Data
public class ScToStudentMap {

    private String sid;

    private String cid;

    private Student student;

}
