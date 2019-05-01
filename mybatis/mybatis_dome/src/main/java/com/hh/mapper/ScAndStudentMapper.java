package com.hh.mapper;

import com.hh.resultmap.ScToStudentMap;
import com.hh.resultmap.StudentToScMap;

public interface ScAndStudentMapper {
    ScToStudentMap oneToOne1(String sid);
    ScToStudentMap oneToOne2(String sid);
    StudentToScMap oneToN1(String sid);
    StudentToScMap oneToN2(String sid);

}
