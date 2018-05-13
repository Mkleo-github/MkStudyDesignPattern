package com.mkleo.S4建造者模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/7 9:59 星期一
 */
public class UserBuilder {

    private final String mUserName;
    private final String mUserAge;

    private UserBuilder(String userName, String userAge) {
        this.mUserName = userName;
        this.mUserAge = userAge;
    }


    public String getUserAge() {
        return mUserAge;
    }

    public String getUserName() {
        return mUserName;
    }

    public static class Builder implements IBuilder<UserBuilder> {

        private String mUserName;
        private String mUserAge;

        public Builder setUserAge(String userAge) {
            this.mUserAge = userAge;
            return this;
        }

        public Builder setUserName(String userName) {
            this.mUserName = userName;
            return this;
        }

        @Override
        public UserBuilder build() {
            return new UserBuilder(mUserName, mUserAge);
        }
    }

}
