package com.guanyu.provider.book.domain;

/**
 * 书籍类型枚举
 * @author Guanyu
 */
public enum BookTypeEnum {

    /**
     * 文本书籍
     */
    BOOK(1, "文本书"),
    /**
     * 漫画书籍
     */
    COMIC(2, "漫画"),
    /**
     * 有声书籍
     */
    AUDIO(3, "听书");

    private final int type;
    private final String value;

    /**
     * 获取枚举值对应显示名称
     *
     * @param type 枚举值
     * @return {@link String} 类型显示名
     */
    public static String getDisplayName(int type) {
        if (type <= 0) {
            return "";
        }
        for (BookTypeEnum typeEnum : BookTypeEnum.values()) {
            if (typeEnum.getType() == type) {
                return typeEnum.getValue();
            }
        }
        return "";
    }

    BookTypeEnum(int type, String value) {
        this.type = type;
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
