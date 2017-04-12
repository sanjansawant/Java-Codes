package com.Sanjan;

import java.util.List;

/**
 * Created by sanja on 1/7/2017.
 */
public interface ISaveable {

    List read();
    void write(List values);
}
