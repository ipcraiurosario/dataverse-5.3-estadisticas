package edu.harvard.iq.dataverse.branding;

<<<<<<< HEAD
import edu.harvard.iq.dataverse.util.BundleUtil;
import java.util.Arrays;
=======
import edu.harvard.iq.dataverse.DataverseServiceBean;
import edu.harvard.iq.dataverse.settings.SettingsServiceBean;
import edu.harvard.iq.dataverse.util.BundleUtil;
import java.util.Arrays;
import java.util.logging.Logger;

>>>>>>> dataverse-5.3/master
import javax.mail.internet.InternetAddress;

public class BrandingUtil {

<<<<<<< HEAD
    public static String getInstallationBrandName(String rootDataverseName) {
        return rootDataverseName;
    }

    public static String getSupportTeamName(InternetAddress systemAddress, String rootDataverseName) {
=======
    private static final Logger logger = Logger.getLogger(BrandingUtil.class.getCanonicalName());
    
    private static DataverseServiceBean dataverseService;
    private static SettingsServiceBean settingsService;

    public static String getInstallationBrandName() {
        
        String brandName = settingsService.getValueForKey(SettingsServiceBean.Key.InstallationName);
        //Separate if statement simplifies test setup, otherwise could use the getValueForKey method with a default param
        if(brandName==null) {
            brandName = dataverseService.getRootDataverseName();
        }
        return brandName;
    }

    // Convenience to access root name without injecting dataverseService (e.g. in
    // DatasetVersion)
    public static String getRootDataverseCollectionName() {
        return dataverseService.getRootDataverseName();
    }

    public static String getSupportTeamName(InternetAddress systemAddress) {
>>>>>>> dataverse-5.3/master
        if (systemAddress != null) {
            String personalName = systemAddress.getPersonal();
            if (personalName != null) {
                return personalName;
            }
        }
<<<<<<< HEAD
=======
        String rootDataverseName=dataverseService.getRootDataverseName();
>>>>>>> dataverse-5.3/master
        if (rootDataverseName != null && !rootDataverseName.isEmpty()) {
            return rootDataverseName + " " + BundleUtil.getStringFromBundle("contact.support");
        }
        String saneDefault = BundleUtil.getStringFromBundle("dataverse");
        return BundleUtil.getStringFromBundle("contact.support", Arrays.asList(saneDefault));
    }

    public static String getSupportTeamEmailAddress(InternetAddress systemAddress) {
        if (systemAddress == null) {
            return null;
        }
        return systemAddress.getAddress();
    }

<<<<<<< HEAD
    public static String getContactHeader(InternetAddress systemAddress, String rootDataverseName) {
        return BundleUtil.getStringFromBundle("contact.header", Arrays.asList(getSupportTeamName(systemAddress, rootDataverseName)));
    }

=======
    public static String getContactHeader(InternetAddress systemAddress) {
        return BundleUtil.getStringFromBundle("contact.header", Arrays.asList(getSupportTeamName(systemAddress)));
    }

    public static void injectServices(DataverseServiceBean dataverseSvc, SettingsServiceBean settingsSvc) {
        dataverseService = dataverseSvc;
        settingsService = settingsSvc;
    }
>>>>>>> dataverse-5.3/master
}
