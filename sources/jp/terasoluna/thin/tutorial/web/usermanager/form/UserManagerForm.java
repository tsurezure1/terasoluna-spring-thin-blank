package jp.terasoluna.thin.tutorial.web.usermanager.form;

import jp.terasoluna.fw.web.struts.form.ValidatorActionFormEx;

/**
 * ユーザー管理業務で使用するアクションフォーム。
 *
 */
public class UserManagerForm extends ValidatorActionFormEx {

    /**
     * シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;

    /**
     * ID。
     */
    private Long id = null;

    /**
     * 名前。
     */
    private String name = null;

    /**
     * 年齢。
     */
    private String age = null;

    /**
     * 生年月日。
     */
    private String birth = null;

    /**
     * IDを返却する。
     *
     * @return 保持するID
     */
    public Long getId() {
        return id;
    }

    /**
     * IDを設定する。
     *
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 名前を返却する。
     *
     * @return 保持する名前
     */
    public String getName() {
        return name;
    }

    /**
     * 名前を設定する。
     *
     * @param name 名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 年齢を返却する。
     *
     * @return 保持する年齢
     */
    public String getAge() {
        return age;
    }

    /**
     * 年齢を設定する。
     *
     * @param age 年齢
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 生年月日を返却する。
     *
     * @return 保持する生年月日
     */
    public String getBirth() {
        return birth;
    }

    /**
     * 生年月日を設定する。
     *
     * @param birth 生年月日
     */
    public void setBirth(String birth) {
        this.birth = birth;
    }
}