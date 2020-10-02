package com.apple.developer.test1;
public class Player {
    protected void play(int index) throws NoThisSoundException {
        if (index > 10) {
            throw new NoThisSoundException();
        }
    }
}
