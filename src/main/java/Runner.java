import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Runner {
/*    public static void main(String[] args) throws SQLException {
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
                "seller_addres," +
                "seller_name," +
                "seller_store_eng," +
                "seller_store_per," +
                "ssn," +
                "telegram," +
                "token," +
                "website," +
                "faaliat," +
                //"tagdir," +
                "mobasher_name," +
                "mostajer_mobile, " +
                "mostajer_name," +
                "rabet_mobile, " +
                "rabet_name)" +
                //"metadescription," +
                //"metakeywords)"
                 "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://168.119.97.23:5432/tehcfu", "postgres", "ali680313");
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
                    //preparedStatement.setString(17, p.getRole());
                    preparedStatement.setString(17, p.getSellerAddres());
                    preparedStatement.setString(18, p.getSellerName());
                    preparedStatement.setString(19, p.getSellerStoreEng());
                    preparedStatement.setString(20, p.getSellerStorePer());
                    preparedStatement.setString(21, p.getSsn());
                    preparedStatement.setString(22, p.getTelegram());
                    preparedStatement.setString(23, p.getToken());
                    preparedStatement.setString(24, p.getWebsite());
                    preparedStatement.setString(25, p.getFaaliat());
                    //preparedStatement.setString(26, p.getTagdirName());
                    preparedStatement.setString(26, p.getMobasherName());
                    preparedStatement.setString(27, p.getMostajerMobile());
                    preparedStatement.setString(28, p.getMostajerName());
                    preparedStatement.setString(29, p.getRabetMobile());
                    preparedStatement.setString(30, p.getRabetName());
                    //preparedStatement.setString(31, p.getMetaDescription());
                    //preparedStatement.setString(31, p.getMetaKeywords());
                    int insertedRow = preparedStatement.executeUpdate();
                    System.out.println("inserted");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            });

        }
    }*/
/*public static void main(String[] args) throws SQLException {
    String SQL_SELECT = "Select * from MOBL_TBL";
    List<MoblEntity> moblEntities = new ArrayList<>();
    try (Connection conn = DriverManager.getConnection(
            "jdbc:postgresql://49.13.85.91:5432/tehcfu", "postgres2", "ali680313");
         PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            //if(resultSet.getString("role")==null && resultSet.getString("role").equals("USER")) {
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
            //}
        }
    }
    String sql = "INSERT INTO user_tbl(email,mobile,name," +
            "password)" +
            //"metadescription," +
            //"metakeywords)"
            "VALUES(?,?,?,?)";
    try (Connection conn = DriverManager.getConnection(
            "jdbc:postgresql://168.119.97.23:5432/tehcfu", "postgres", "ali680313");
         PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
        moblEntities.forEach(p->{
            String email = p.getEmail();
            if(p.getEmail()!=null) {
                if (p.getEmail().equals(""))
                    email = null;
                else if (p.getEmail().trim().equals("-")) {
                    email = null;
                } else
                    email = p.getEmail();
            }

            try {
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, p.getMobile());
                preparedStatement.setString(3, p.getSellerName());
                preparedStatement.setString(4, p.getPassword());
                int insertedRow = preparedStatement.executeUpdate();
                System.out.println("inserted");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        });

    }
}*/
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
            "jdbc:postgresql://192.168.2.41:5432/postgres", "postgres", "ali680313");
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

    public static void main(String[] args) throws SQLException {
/*        String SQL_SELECT = "Select * from shop";
        List<MoblEntity> moblEntities = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://168.119.97.23:5432/tehcfu", "postgres", "ali680313");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                //if(resultSet.getString("role")==null && resultSet.getString("role").equals("USER")) {
                MoblEntity moblEntity = new MoblEntity();
                moblEntity.setSellerStoreEng(resultSet.getString("seller_store_eng"));
                moblEntity.setFaaliat(resultSet.getString("faaliat"));
                moblEntities.add(moblEntity);
                //}
            }
        }
        moblEntities.forEach(m->{
            String shop = "<url>\n" +
                    "  <loc>https://www.moblsazan.com/fa/shop/"+m.getSellerStoreEng()+ "</loc>\n" +
                    "  <lastmod>2024-02-17T18:27:20+00:00</lastmod>\n" +
                    "  <priority>0.80</priority>\n" +
                    "</url>\n";
           writeToFile(shop);
        });*/
        String SQL_SELECT = "Select * from product_cj";
        List<MoblEntity> moblEntities = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://168.119.97.23:5432/tehcfu", "postgres", "ali680313");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                //if(resultSet.getString("role")==null && resultSet.getString("role").equals("USER")) {
                MoblEntity moblEntity = new MoblEntity();
                moblEntity.setSellerStoreEng(resultSet.getString("pid"));
                moblEntities.add(moblEntity);
                //}
            }
        }
        moblEntities.forEach(m->{
            String shop = "<url>\n" +
                    "  <loc>https://www.moblsazan.com/fa/product/id="+m.getSellerStoreEng()+ "</loc>\n" +
                    "  <lastmod>2024-02-17T18:27:20+00:00</lastmod>\n" +
                    "  <priority>0.80</priority>\n" +
                    "</url>\n";
            writeToFile(shop);
        });
    }

    public static void writeToFile(String val){
        File file = new File("C:\\Users\\OutUser\\Documents\\sitemap.xml");
        CharSink chs = Files.asCharSink(
                file, Charsets.UTF_8, FileWriteMode.APPEND);
        try {
            chs.write(val+"\r\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
