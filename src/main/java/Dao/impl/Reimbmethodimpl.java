package Dao.impl;


import Dao.Reimbmethod;
import model.Reimb;
import util.Connectionfac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Reimbmethodimpl implements Reimbmethod {
    Connection con;

    public Reimbmethodimpl() {
        this.con = Connectionfac.getConnection();
    }

    @Override
    public boolean approverequest() throws SQLException {
        Reimb rem=new Reimb();
        String sql="update Reimb set rem_status='APPROVE',hr_id=? where rem_id=? ";
        PreparedStatement preparedStatement = con.prepareStatement(sql);

        preparedStatement.setString(1, rem.getHr_id());
        preparedStatement.setInt(2, rem.getRem_id());
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Case Updated");
            return true;
        } else {
            System.out.println("Not Updated");
            return false;
        }

    }

    @Override
    public boolean denyrequest() throws SQLException {
        Reimb rem=new Reimb();
        String sql="update Reimb set rem_status='DENY',hr_id=? where rem_id=? ";
        PreparedStatement preparedStatement = con.prepareStatement(sql);

        preparedStatement.setString(1, rem.getHr_id());
        preparedStatement.setInt(2, rem.getRem_id());
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Case Updated");
            return true;
        } else {
            System.out.println("Not Updated");
            return false;
        }

    }
   /* @Override
    public boolean approverequest() throws SQLException {
        Reimb rem=new Reimb();
        String sql="update Reimb set rem_status='APPROVE',hr_id=? where rem_id=? ";
        PreparedStatement preparedStatement = con.prepareStatement(sql);

        preparedStatement.setString(1, rem.getHr_id());
        preparedStatement.setInt(2, rem.getRem_id());
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Case Updated");
            return true;
        } else {
            System.out.println("Not Updated");
        }
        return false;

    }

    @Override
    public boolean denyrequest() throws SQLException {
        Reimb rem=new Reimb();
        String sql="update Reimb set rem_status='DENY',hr_id=? where rem_id=? ";
        PreparedStatement preparedStatement = con.prepareStatement(sql);

        preparedStatement.setString(1, rem.getHr_id());
        preparedStatement.setInt(2, rem.getRem_id());
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Case Updated");
            return true;
        } else {
            System.out.println("Not Updated");
        }
        return false;

    }
*/
}
