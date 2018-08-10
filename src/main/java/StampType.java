
/**
 * 服务类别枚举
 *
 * @author: zhounan.zn
 * @date: 2018/6/20
 */
public enum StampType {

    /**
     * 项目
     */
    project,

    /**
     * 个人
     */
    user;

    public static StampType fromObjectType(String objectType) {
        switch (NavigationObjectType.valueOf(objectType)) {
            case AKProject:
                return project;
            case User:
                return user;
            default:
                throw new IllegalArgumentException("invalid object type: " + objectType);
        }
    }

}
