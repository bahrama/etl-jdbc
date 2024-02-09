
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ProductEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long productId;
	private String nameCode;
	private String brand;
	private String contry;
	private String raste;
	private String abad;
	private String description;
	private String pic1;
	private String pic2;
	private String pic3;
	private String pic4;
	private String pic5;
	private boolean status;
	private int TahvilDay;
	private boolean EasyNezafat;
	private long price;
	private long price2;
	
	private boolean oldNew;
	
	private String zemanat;
	private String guarantiStatus;
	private int guaranyTimeMounth;
	private String rangBandi;
	
	private boolean checkO;

	private Date pDate;

	private MoblEntity product;
	
	private String aparat;
	
	private String instagram;
	
	private String proType;

	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}




	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}


	public String getNameCode() {
		return nameCode;
	}

	public void setNameCode(String nameCode) {
		this.nameCode = nameCode;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getTahvilDay() {
		return TahvilDay;
	}

	public void setTahvilDay(int tahvilDay) {
		TahvilDay = tahvilDay;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	public String getRaste() {
		return raste;
	}

	public void setRaste(String raste) {
		this.raste = raste;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPic1() {
		return pic1;
	}

	public void setPic1(String pic1) {
		this.pic1 = pic1;
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

	public String getPic4() {
		return pic4;
	}

	public void setPic4(String pic4) {
		this.pic4 = pic4;
	}

	public String getPic5() {
		return pic5;
	}

	public void setPic5(String pic5) {
		this.pic5 = pic5;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public boolean isCheckO() {
		return checkO;
	}

	public void setCheckO(boolean checkO) {
		this.checkO = checkO;
	}

	public long getPrice2() {
		return price2;
	}

	public void setPrice2(long price2) {
		this.price2 = price2;
	}



	public boolean isOldNew() {
		return oldNew;
	}

	public void setOldNew(boolean oldNew) {
		this.oldNew = oldNew;
	}

	
	
	/*
	 * public String getNoeMobl() { return noeMobl; }
	 * 
	 * public void setNoeMobl(String noeMobl) { this.noeMobl = noeMobl; }
	 */

	/*
	 * public int getTedadNafar() { return tedadNafar; }
	 * 
	 * public void setTedadNafar(int tedadNafar) { this.tedadNafar = tedadNafar; }
	 * 
	 * public String getNoeMoblRahati() { return noeMoblRahati; }
	 * 
	 * public void setNoeMoblRahati(String noeMoblRahati) { this.noeMoblRahati =
	 * noeMoblRahati; }
	 * 
	 * public String getJenseKalaf() { return jenseKalaf; }
	 * 
	 * public void setJenseKalaf(String jenseKalaf) { this.jenseKalaf = jenseKalaf;
	 * }
	 * 
	 * public String getNoePaye() { return noePaye; }
	 * 
	 * public void setNoePaye(String noePaye) { this.noePaye = noePaye; }
	 * 
	 * public String getJenseLayeMiani() { return jenseLayeMiani; }
	 * 
	 * public void setJenseLayeMiani(String jenseLayeMiani) { this.jenseLayeMiani =
	 * jenseLayeMiani; }
	 */

	/*
	 * public String getJenseParche() { return jenseParche; }
	 * 
	 * public void setJenseParche(String jenseParche) { this.jenseParche =
	 * jenseParche; }
	 */

	public String getZemanat() {
		return zemanat;
	}

	public void setZemanat(String zemanat) {
		this.zemanat = zemanat;
	}

	public String getRangBandi() {
		return rangBandi;
	}

	public void setRangBandi(String rangBandi) {
		this.rangBandi = rangBandi;
	}

	/*
	 * public boolean isKosan() { return kosan; }
	 * 
	 * public void setKosan(boolean kosan) { this.kosan = kosan; }
	 * 
	 * public boolean isMiz() { return miz; }
	 * 
	 * public void setMiz(boolean miz) { this.miz = miz; }
	 */

	public String getAbad() {
		return abad;
	}

	public void setAbad(String abad) {
		this.abad = abad;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getpDate() {
		return pDate;
	}

	public void setpDate(Date pDate) {
		this.pDate = pDate;
	}



	public String getGuarantiStatus() {
		return guarantiStatus;
	}

	public void setGuarantiStatus(String guarantiStatus) {
		this.guarantiStatus = guarantiStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public boolean isEasyNezafat() {
		return EasyNezafat;
	}

	public void setEasyNezafat(boolean easyNezafat) {
		EasyNezafat = easyNezafat;
	}

	public int getGuaranyTimeMounth() {
		return guaranyTimeMounth;
	}

	public void setGuaranyTimeMounth(int guaranyTimeMounth) {
		this.guaranyTimeMounth = guaranyTimeMounth;
	}

	public MoblEntity getProduct() {
		return product;
	}




	public void setProduct(MoblEntity product) {
		this.product = product;
	}


	public String getAparat() {
		return aparat;
	}




	public void setAparat(String aparat) {
		this.aparat = aparat;
	}




	public String getInstagram() {
		return instagram;
	}




	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}






	public String getProType() {
		return proType;
	}




	public void setProType(String proType) {
		this.proType = proType;
	}




}
