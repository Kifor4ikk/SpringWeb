package ru.kifor4ik.Webserver.DatabasesDAO;

import org.postgresql.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.kifor4ik.Webserver.models.Profile;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component("profileDAO")
public class ProfileDAO {
    
    private static final String URLDataBase = "jdbc:postgresql://localhost:1489/postgres";
    private static final String NameDataBase = "postgres";
    private static final String PassDataBase = "password";

    private static Connection connection;

    static
    {
        try {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(URLDataBase, NameDataBase,PassDataBase);

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Profile> getAllProfiles(){
        List<Profile> list = new ArrayList<>();
        try{
            Statement state = connection.createStatement();
            ResultSet result = state.executeQuery("select * from userslist");
            Profile profile = new Profile();
            while(result.next()){
                profile.setId(result.getString("id"));
                profile.setName(result.getString("name"));
                profile.setNickname(result.getString("nickname"));
                profile.setMail(result.getString("mail"));
                list.add(profile);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println(list.size() + " size of list ");
        System.out.println(list.get(0).toString());
        return list;
    }

    public Profile getProfileById(String id){
        Profile profile = new Profile();
        try{
            Statement state = connection.createStatement();
            ResultSet result = state.executeQuery("select * from userslist where id ='" + id + "'");
            if(result.next()){
                profile.setId(id);
                profile.setName(result.getString("name"));
                profile.setNickname(result.getString("nickname"));
                profile.setMail(result.getString("mail"));
                System.out.println("Profile was found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Profile was mailed");
        return profile;
    }

    public boolean createProfile(Profile profile){


        return true;
    }

}
