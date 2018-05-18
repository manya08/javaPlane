package com.tarena.shoot;

public interface Award {
    int LIFE = 0; // 1条命 1
    int FIRE = 3; // 双倍火力 2
    int TRICK = 5;// 大招 3
    int HP = 5;// 血量 3
    int DAMEGE = 10;// 伤害 1
    int BIGFIRE=0;
    /** 获得奖励类型(上面的0或1) */
    int getType();
}
