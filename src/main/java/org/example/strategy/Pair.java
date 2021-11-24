package org.example.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Pair<T1, T2> {
    T1 first;
    T2 second;
}
