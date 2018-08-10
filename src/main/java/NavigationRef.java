import java.util.Objects;

public class NavigationRef extends MybatisBaseObject {

    private static final long serialVersionUID = 6408529132733790869L;
    /**
     * 导航ID
     */
    private Long navigationId1;
    
      /**
     * Project/User/GLOBAL
     */
    private String refObjectType1;

    /**
     * project_id/staff_id/-1
     */
    private String refObjectId;

    /**
     * Project/User/GLOBAL
     */
    private String refObjectType;

    /**
     * 所属企业 ID
     */
    private Long regionId;

    public NavigationRef() {
    }

    public NavigationRef(String refObjectId, String refObjectType, Long regionId) {
        this.refObjectId = refObjectId;
        this.refObjectType = refObjectType;
        this.regionId = regionId;
    }

    public Long getNavigationId() {
        return navigationId;
    }

    public void setNavigationId(Long navigationId) {
        this.navigationId = navigationId;
    }

    public String getRefObjectId() {
        return refObjectId;
    }

    public void setRefObjectId(String refObjectId) {
        this.refObjectId = refObjectId;
    }

    public String getRefObjectType() {
        return refObjectType;
    }

    public void setRefObjectType(String refObjectType) {
        this.refObjectType = refObjectType;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public static NavigationRef fromNavigationRefDTO(NavigationRefDTO navigationRefDTO, String staffId) {
        NavigationRef navigationRef = BeanUtil.copy(navigationRefDTO, NavigationRef.class);
        if(navigationRef == null) {
            return null;
        }

        navigationRef.resetActionDateAndUser(staffId);
        navigationRef.setDeleted(false);
        return navigationRef;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NavigationRef that = (NavigationRef)o;
        return navigationId.equals(that.navigationId) && Objects.equals(refObjectId, that.refObjectId) && Objects
            .equals(refObjectType, that.refObjectType) && regionId.equals(that.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(navigationId, refObjectId, refObjectType, regionId);
    }
}
