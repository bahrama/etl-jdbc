import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Runner {
   public static void main(String[] args) throws SQLException {
        String SQL_SELECT = "Select * from MOBL_TBL";
        List<MoblEntity> moblEntities = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://49.13.85.91:5432/tehcfu", "postgres2", "ali680313");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                if(resultSet.getString("role")!=null && resultSet.getString("role").equals("MERCHANT")) {
                    MoblEntity moblEntity = new MoblEntity();
                    moblEntity.setAboutUs(resultSet.getString("about_us"));
                    moblEntity.setEmail(resultSet.getString("email"));
                    moblEntity.setFax(resultSet.getString("fax"));
                    moblEntity.setInstagram(resultSet.getString("instagram"));
                    moblEntity.setLat(resultSet.getDouble("lat"));
                    moblEntity.setLng(resultSet.getDouble("lng"));
                    moblEntity.setMobile(resultSet.getString("mobile"));
                    moblEntity.setModirforoshName(resultSet.getString("modirforosh_name"));
                    moblEntity.setModirforoshPhone(resultSet.getString("modirforosh_phone"));
                    moblEntity.setPhone(resultSet.getString("phone"));
                    moblEntity.setPic1(resultSet.getString("pic1"));
                    moblEntity.setPic2(resultSet.getString("pic2"));
                    moblEntity.setPic3(resultSet.getString("pic3"));
                    moblEntity.setPic4(resultSet.getString("pic4"));
                    moblEntity.setPic5(resultSet.getString("pic5"));
                    moblEntity.setPostcode(resultSet.getString("postcode"));
                    moblEntity.setRole(resultSet.getString("role"));
                    moblEntity.setSellerAddres(resultSet.getString("seller_addres"));
                    moblEntity.setSellerName(resultSet.getString("seller_name"));
                    moblEntity.setSellerStoreEng(resultSet.getString("seller_store_eng"));
                    moblEntity.setSellerStorePer(resultSet.getString("seller_store_per"));
                    moblEntity.setSsn(resultSet.getString("ssn"));
                    moblEntity.setTelegram(resultSet.getString("telegram"));
                    moblEntity.setToken(resultSet.getString("token"));
                    moblEntity.setWebsite(resultSet.getString("website"));
                    moblEntity.setFaaliat(resultSet.getString("faaliat"));
                    moblEntity.setTagdirName(resultSet.getString("tagdir"));
                    moblEntity.setMobasherName(resultSet.getString("mobasher_name"));
                    moblEntity.setMostajerMobile(resultSet.getString("mostajer_mobile"));
                    moblEntity.setMostajerName(resultSet.getString("mostajer_name"));
                    moblEntity.setRabetMobile(resultSet.getString("rabet_mobile"));
                    moblEntity.setRabetName(resultSet.getString("rabet_name"));
                    moblEntity.setMetaDescription(resultSet.getString("metadescription"));
                    moblEntity.setMetaKeywords(resultSet.getString("metakeywords"));
                moblEntities.add(moblEntity);
                }
            }
        }
        String sql = "INSERT INTO shop(about_us, email,fax," +
                "instagram," +
                "lat," +
                " lng," +
                "mobile,"+
                "modirforosh_name," +
                "modirforosh_phone," +
                "phone," +
                "pic1," +
                "pic2," +
                "pic3," +
                "pic4," +
                "pic5," +
                "postcode," +
                "role," +
                "seller_addres," +
                "seller_name," +
                "seller_store_eng," +
                "seller_store_per," +
                "ssn," +
                "telegram," +
                "token," +
                "website," +
                "faaliat," +
                "tagdir," +
                "mobasher_name," +
                "mostajer_mobile, " +
                "mostajer_name," +
                "rabet_mobile, " +
                "rabet_name," +
                "metadescription," +
                "metakeywords)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://192.168.1.100:5432/postgres", "postgres", "ali680313");
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            moblEntities.forEach(p->{


                try {
                    preparedStatement.setString(1, p.getAboutUs());
                    preparedStatement.setString(2, p.getEmail());
                    preparedStatement.setString(3, p.getFax());
                    preparedStatement.setString(4, p.getInstagram());
                    preparedStatement.setDouble(5, p.getLat());
                    preparedStatement.setDouble(6, p.getLng());
                    preparedStatement.setString(7, p.getMobile());
                    preparedStatement.setString(8, p.getModirforoshName());
                    preparedStatement.setString(9, p.getModirforoshPhone());
                    preparedStatement.setString(10, p.getPhone());
                    preparedStatement.setString(11, p.getPic1());
                    preparedStatement.setString(12, p.getPic2());
                    preparedStatement.setString(13, p.getPic3());
                    preparedStatement.setString(14, p.getPic4());
                    preparedStatement.setString(15, p.getPic5());
                    preparedStatement.setString(16, p.getPostcode());
                    preparedStatement.setString(17, p.getRole());
                    preparedStatement.setString(18, p.getSellerAddres());
                    preparedStatement.setString(19, p.getSellerName());
                    preparedStatement.setString(20, p.getSellerStoreEng());
                    preparedStatement.setString(21, p.getSellerStorePer());
                    preparedStatement.setString(22, p.getSsn());
                    preparedStatement.setString(23, p.getTelegram());
                    preparedStatement.setString(24, p.getToken());
                    preparedStatement.setString(25, p.getWebsite());
                    preparedStatement.setString(26, p.getFaaliat());
                    preparedStatement.setString(27, p.getTagdirName());
                    preparedStatement.setString(28, p.getMobasherName());
                    preparedStatement.setString(29, p.getMostajerMobile());
                    preparedStatement.setString(30, p.getMostajerName());
                    preparedStatement.setString(31, p.getRabetMobile());
                    preparedStatement.setString(32, p.getRabetName());
                    preparedStatement.setString(33, p.getMetaDescription());
                    preparedStatement.setString(34, p.getMetaKeywords());
                    int insertedRow = preparedStatement.executeUpdate();
                    System.out.println("inserted");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            });

        }
    }
/*public static void main(String[] args) throws SQLException {
    String SQL_SELECT = "Select * from PRODUCT_TBL";
    List<ProductEntity> productEntities = new ArrayList<>();
    try (Connection conn = DriverManager.getConnection(
            "jdbc:postgresql://49.13.85.91:5432/tehcfu", "postgres2", "ali680313");
         PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
                ProductEntity moblEntity = new ProductEntity();
                moblEntity.setBrand(resultSet.getString("abad"));
                moblEntity.setContry(resultSet.getString("contry"));
                moblEntity.setDescription(resultSet.getString("description"));
                moblEntity.setNameCode(resultSet.getString("namecode"));
                moblEntity.setPic1(resultSet.getString("pic1"));
                moblEntity.setPic2(resultSet.getString("pic2"));
                moblEntity.setPic3(resultSet.getString("pic3"));
                moblEntity.setPic4(resultSet.getString("pic4"));
                moblEntity.setPic5(resultSet.getString("pic5"));
                moblEntity.setRaste(resultSet.getString("raste"));
                moblEntity.setZemanat(resultSet.getString("zemanat"));
                productEntities.add(moblEntity);
        }
    }
    String sql = "INSERT INTO product(size, country,description," +
            "guaranty," +
            "name," +
            " pic1," +
            "pic2,"+
            "pic3," +
            "pic4," +
            "pic5," +
            "raste)"
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    try (Connection conn = DriverManager.getConnection(
            "jdbc:postgresql://192.168.1.100:5432/postgres", "postgres", "ali680313");
         PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
        productEntities.forEach(p->{


            try {
                preparedStatement.setString(1, p.getAbad());
                preparedStatement.setString(2, p.getContry());
                preparedStatement.setString(3, p.getDescription());
                preparedStatement.setString(4, p.getZemanat());
                preparedStatement.setString(5, p.getNameCode());
                preparedStatement.setString(6, p.getPic1());
                preparedStatement.setString(7, p.getPic2());
                preparedStatement.setString(8, p.getPic3());
                preparedStatement.setString(9, p.getPic4());
                preparedStatement.setString(10, p.getPic5());
                preparedStatement.setString(11, p.getRaste());
                int insertedRow = preparedStatement.executeUpdate();
                System.out.println("inserted");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        });

    }
}*/
}
