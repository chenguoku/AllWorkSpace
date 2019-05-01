package com.hh.resultmap;

import com.hh.dao.Sc;
import lombok.Data;

import java.util.List;

@Data
public class StudentToScMap {

    private String sid;

    private String sname;

    private List<Sc> list;

}
