package com.hh.executor;

public interface HHExecutor {
    <T> T query(String statement, Object parameter);
}
