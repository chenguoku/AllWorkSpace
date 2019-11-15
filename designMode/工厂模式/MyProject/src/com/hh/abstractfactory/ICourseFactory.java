package com.hh.abstractfactory;

public interface ICourseFactory {
    INote createNode();

    IVideo createVideo();
}
