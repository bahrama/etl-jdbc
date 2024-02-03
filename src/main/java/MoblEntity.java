
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;



public class MoblEntity implements Serializable {
	private static final long serialVersionUID = 1L;


	private Integer id;

	private String aboutUs;

	private String email;

	private String fax;

	private String instagram;


	private String modirforoshName;

	private String modirforoshPhone;

	private String phone;

	private String pic1;

	private String pic2;

	private String pic3;

	private String pic4;

	private String pic5;

	private String postcode;


	private String sellerAddres;

	private String sellerName;

	private String sellerStoreEng;

	private String sellerStorePer;

	private String telegram;

	private String website;

	private double lat;

	private double lng;

	private String panel;

	private String noeFaaliat;
	private String mobile;

	private String ssn;
	

	private String role;

	private String token;

	private Date birthDate;

	private int authCode;
	private String faaliat;

	private String tagdirName;
	
	private String vage;
	//////////////////////////////////////////
	private String malekiat;
	
	private String sabteSefaresh;
	private boolean mostajer;
	

	private Date mohlateEjare;
	
	private String mostajerName;
	

	private Date mostajerBirthday;
	
	private String mostajerSsn;
	
	private String mostajerMobile;
	private String shomareJavaz;
	

	private Date tarikhEtebar;
	private boolean hasMobasher;
	private String mobasherName;
	private String rabetName;
	private String sematRabet;
	private String rabetMobile;
	private String shabakeMazajiMobile;
	
	private String mojtame;
	
	private String metaDescription;
	private String metaKeywords;
	
	
	





	


	
	

	private String password;
	
	


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAboutUs() {
		return this.aboutUs;
	}

	public void setAboutUs(String aboutUs) {
		this.aboutUs = aboutUs;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFaaliat() {
		return faaliat;
	}

	public void setFaaliat(String faaliat) {
		this.faaliat = faaliat;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getInstagram() {
		return this.instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}



	public String getModirforoshName() {
		return this.modirforoshName;
	}

	public void setModirforoshName(String modirforoshName) {
		this.modirforoshName = modirforoshName;
	}

	public String getModirforoshPhone() {
		return this.modirforoshPhone;
	}

	public void setModirforoshPhone(String modirforoshPhone) {
		this.modirforoshPhone = modirforoshPhone;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPic1() {
		return this.pic1;
	}



	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getSellerAddres() {
		return this.sellerAddres;
	}

	public void setSellerAddres(String sellerAddres) {
		this.sellerAddres = sellerAddres;
	}

	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerStoreEng() {
		return this.sellerStoreEng;
	}

	public void setSellerStoreEng(String sellerStoreEng) {
		this.sellerStoreEng = sellerStoreEng;
	}

	public String getSellerStorePer() {
		return this.sellerStorePer;
	}

	public void setSellerStorePer(String sellerStorePer) {
		this.sellerStorePer = sellerStorePer;
	}

	public String getTelegram() {
		return this.telegram;
	}

	public void setTelegram(String telegram) {
		this.telegram = telegram;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPic2() {
		return pic2;
	}

	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}

	public String getPic3() {
		return pic3;
	}

	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}

	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public String getPic4() {
		return pic4;
	}

	public void setPic4(String pic4) {
		this.pic4 = pic4;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
	}

	public String getNoeFaaliat() {
		switch (this.noeFaaliat) {
		case "A":
			return "مبلمان خانگی";
        case "B":
        	return "مبلمان اداری";
        case "C":
        	return "سیسمونی";
        case "D":
        	return "کابینت آشپزخانه";
        case "F":
        	return "مصنوعات چوبی";
        case "G":
        	return "تعمیرات";
        case "I":
        	return "دکوراسیون";
        case "J":
        	return "متفرقه";
		default:
			return null;
		}
	}

	public void setNoeFaaliat(String noeFaaliat) {
		this.noeFaaliat = noeFaaliat;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getAuthCode() {
		return authCode;
	}

	public void setAuthCode(int authCode) {
		this.authCode = authCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoblEntity other = (MoblEntity) obj;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		return true;
	}

	public String getMalekiat() {
		return malekiat;
	}

	public void setMalekiat(String malekiat) {
		this.malekiat = malekiat;
	}

	public String getSabteSefaresh() {
		return sabteSefaresh;
	}

	public void setSabteSefaresh(String sabteSefaresh) {
		this.sabteSefaresh = sabteSefaresh;
	}

	public boolean isMostajer() {
		return mostajer;
	}

	public void setMostajer(boolean mostajer) {
		this.mostajer = mostajer;
	}

	public Date getMohlateEjare() {
		return mohlateEjare;
	}

	public void setMohlateEjare(Date mohlateEjare) {
		this.mohlateEjare = mohlateEjare;
	}

	public String getMostajerName() {
		return mostajerName;
	}

	public void setMostajerName(String mostajerName) {
		this.mostajerName = mostajerName;
	}

	public Date getMostajerBirthday() {
		return mostajerBirthday;
	}

	public void setMostajerBirthday(Date mostajerBirthday) {
		this.mostajerBirthday = mostajerBirthday;
	}

	public String getMostajerSsn() {
		return mostajerSsn;
	}

	public void setMostajerSsn(String mostajerSsn) {
		this.mostajerSsn = mostajerSsn;
	}

	public String getMostajerMobile() {
		return mostajerMobile;
	}

	public void setMostajerMobile(String mostajerMobile) {
		this.mostajerMobile = mostajerMobile;
	}

	public String getShomareJavaz() {
		return shomareJavaz;
	}

	public void setShomareJavaz(String shomareJavaz) {
		this.shomareJavaz = shomareJavaz;
	}

	public Date getTarikhEtebar() {
		return tarikhEtebar;
	}

	public void setTarikhEtebar(Date tarikhEtebar) {
		this.tarikhEtebar = tarikhEtebar;
	}

	public boolean isHasMobasher() {
		return hasMobasher;
	}

	public void setHasMobasher(boolean hasMobasher) {
		this.hasMobasher = hasMobasher;
	}

	public String getMobasherName() {
		return mobasherName;
	}

	public void setMobasherName(String mobasherName) {
		this.mobasherName = mobasherName;
	}

	public String getRabetName() {
		return rabetName;
	}

	public void setRabetName(String rabetName) {
		this.rabetName = rabetName;
	}

	public String getSematRabet() {
		return sematRabet;
	}

	public void setSematRabet(String sematRabet) {
		this.sematRabet = sematRabet;
	}

	public String getRabetMobile() {
		return rabetMobile;
	}

	public void setRabetMobile(String rabetMobile) {
		this.rabetMobile = rabetMobile;
	}

	public String getShabakeMazajiMobile() {
		return shabakeMazajiMobile;
	}

	public void setShabakeMazajiMobile(String shabakeMazajiMobile) {
		this.shabakeMazajiMobile = shabakeMazajiMobile;
	}

	public String getMojtame() {
		return mojtame;
	}

	public void setMojtame(String mojtame) {
		this.mojtame = mojtame;
	}


	public String getTagdirName() {
		return tagdirName;
	}

	public void setTagdirName(String tagdirName) {
		this.tagdirName = tagdirName;
	}

	public String getVage() {
		return vage;
	}

	public void setVage(String vage) {
		this.vage = vage;
	}

	public String getPic5() {
		return pic5;
	}

	public void setPic5(String pic5) {
		this.pic5 = pic5;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getMetaKeywords() {
		return metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	
	
}