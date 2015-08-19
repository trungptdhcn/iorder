package com.gmc.iorder.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.gmc.iorder.dao.entites.*;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.UUID;

/**
 * Created by trungpt on 3/31/15.
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper
{
    private static final int DATABASE_VERSION = 1;
    public static String DATABASE_NAME = "ioder.db";
    private static DatabaseHelper instance;
    private Context context;
    private Dao<Product, UUID> productDao;
    private Dao<Communication, UUID> communicationDao;
    private Dao<Contact, UUID> contactDao;
    private Dao<Photo, UUID> photoDao;
    private Dao<WhereOrder, UUID> whereOrderDao;
    private Dao<Manufacture, UUID> manufactureDao;


    public DatabaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    public static DatabaseHelper getInstance(Context ctx)
    {
        if (instance == null)
        {
            instance = new DatabaseHelper(ctx.getApplicationContext());
        }
        return instance;
    }

    public Dao<Product, UUID> getProductDao() throws SQLException
    {
        if (productDao == null)
        {
            productDao = getDao(Product.class);
            ((BaseDaoImpl) productDao).initialize();
        }
        return productDao;
    }

    public Dao<Communication, UUID> getCommunicationDao() throws SQLException
    {
        if (communicationDao == null)
        {
            communicationDao = getDao(Communication.class);
            ((BaseDaoImpl) communicationDao).initialize();
        }
        return communicationDao;
    }

    public Dao<Contact, UUID> getContactDaoDao() throws SQLException
    {
        if (contactDao == null)
        {
            contactDao = getDao(Contact.class);
            ((BaseDaoImpl) contactDao).initialize();
        }
        return contactDao;
    }

    public Dao<Photo, UUID> getPhotoDaoDao() throws SQLException
    {
        if (photoDao == null)
        {
            photoDao = getDao(Photo.class);
            ((BaseDaoImpl) photoDao).initialize();
        }
        return photoDao;
    }

    public Dao<WhereOrder, UUID> getWhereOrderDao() throws SQLException
    {
        if (whereOrderDao == null)
        {
            whereOrderDao = getDao(WhereOrder.class);
            ((BaseDaoImpl) whereOrderDao).initialize();
        }
        return whereOrderDao;
    }

    public Dao<Manufacture, UUID> getManufactureDao() throws SQLException
    {
        if (manufactureDao == null)
        {
            manufactureDao = getDao(Manufacture.class);
            ((BaseDaoImpl) manufactureDao).initialize();
        }
        return manufactureDao;
    }

// -------------------------- OTHER METHODS --------------------------

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource)
    {
        try
        {
            TableUtils.createTable(connectionSource, Product.class);
            TableUtils.createTable(connectionSource, Communication.class);
            TableUtils.createTable(connectionSource, Contact.class);
            TableUtils.createTable(connectionSource, Photo.class);
            TableUtils.createTable(connectionSource, WhereOrder.class);
            TableUtils.createTable(connectionSource, Manufacture.class);
//            String story = FileUtils.readRawFileAsString(context, R.raw.story);
//            String[] stories = story.split(";");
//            for (String query : stories)
//            {
//                sqLiteDatabase.execSQL(query);
//            }

        }
        catch (Exception e)
        {
            Log.e(this.getClass().getName(), e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int oldVersion,
                          int newVersion)
    {
        try
        {
//            TableUtils.createTable(connectionSource, Product.class);
//            TableUtils.createTable(connectionSource, Communication.class);
//            TableUtils.createTable(connectionSource, Contact.class);
//            TableUtils.createTable(connectionSource, Photo.class);
//            TableUtils.createTable(connectionSource, WhereOrder.class);
//            TableUtils.createTable(connectionSource, Manufacture.class);

            TableUtils.dropTable(connectionSource, Product.class, true);
            TableUtils.dropTable(connectionSource, Communication.class, true);
            TableUtils.dropTable(connectionSource, Contact.class, true);
            TableUtils.dropTable(connectionSource, Photo.class, true);
            TableUtils.dropTable(connectionSource, WhereOrder.class, true);
            TableUtils.dropTable(connectionSource, Manufacture.class, true);

            TableUtils.createTable(connectionSource, Product.class);
            TableUtils.createTable(connectionSource, Communication.class);
            TableUtils.createTable(connectionSource, Contact.class);
            TableUtils.createTable(connectionSource, Photo.class);
            TableUtils.createTable(connectionSource, WhereOrder.class);
            TableUtils.createTable(connectionSource, Manufacture.class);

        }
        catch (SQLException e)
        {
        }
    }

    public void dropAllDatabase() throws SQLException
    {
        TableUtils.dropTable(connectionSource, Product.class, true);
        TableUtils.dropTable(connectionSource, Communication.class, true);
        TableUtils.dropTable(connectionSource, Contact.class, true);
        TableUtils.dropTable(connectionSource, Photo.class, true);
        TableUtils.dropTable(connectionSource, WhereOrder.class, true);
        TableUtils.dropTable(connectionSource, Manufacture.class, true);

    }

    public void createTables() throws SQLException
    {
        TableUtils.createTable(connectionSource, Product.class);
        TableUtils.createTable(connectionSource, Communication.class);
        TableUtils.createTable(connectionSource, Contact.class);
        TableUtils.createTable(connectionSource, Photo.class);
        TableUtils.createTable(connectionSource, WhereOrder.class);
        TableUtils.createTable(connectionSource, Manufacture.class);
    }
}
