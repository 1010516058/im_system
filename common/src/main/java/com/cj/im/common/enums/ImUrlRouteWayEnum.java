package com.cj.im.common.enums;

public enum ImUrlRouteWayEnum {

    /**
     * 随机
     */
    RAMDOM(1,"com.cj.im.common.route.algorithm.random.RandomHandler"),


    /**
     * 1.轮训
     */
    LOOP(2,"com.cj.im.common.route.algorithm.loop.LoopHandler"),

    /**
     * HASH
     */
    HASH(3,"com.cj.im.common.route.algorithm.consistenthash.ConsistentHashHandle"),
    ;



    private int code;
    private String clazz;

    /**
     * 不能用 默认的 enumType b= enumType.values()[i]; 因为本枚举是类形式封装
     * @param ordinal
     * @return
     */
    public static ImUrlRouteWayEnum getHandler(int ordinal) {
        for (int i = 0; i < ImUrlRouteWayEnum.values().length; i++) {
            if (ImUrlRouteWayEnum.values()[i].getCode() == ordinal) {
                return ImUrlRouteWayEnum.values()[i];
            }
        }
        return null;
    }

    ImUrlRouteWayEnum(int code, String clazz){
        this.code=code;
        this.clazz=clazz;
    }

    public String getClazz() {
        return clazz;
    }

    public int getCode() {
        return code;
    }
}
