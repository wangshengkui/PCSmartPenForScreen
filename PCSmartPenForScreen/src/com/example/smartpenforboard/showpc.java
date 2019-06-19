package com.example.smartpenforboard;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class showpc extends Activity {
	
	com.example.smartpenforboard.MainActivity activity;
	TextView textView;
	int i=MainActivity.contpc;
	String UpPName[] = {null,
			MainActivity.UpPicName[0],
			MainActivity.UpPicName[1],
			MainActivity.UpPicName[2],
			MainActivity.UpPicName[3],
			MainActivity.UpPicName[4],
			MainActivity.UpPicName[5],
			MainActivity.UpPicName[6],
			MainActivity.UpPicName[7],
			MainActivity.UpPicName[8],
			MainActivity.UpPicName[9],
			MainActivity.UpPicName[10],
			MainActivity.UpPicName[11],
			MainActivity.UpPicName[12],
			MainActivity.UpPicName[13],
			MainActivity.UpPicName[14],
			MainActivity.UpPicName[15],
			MainActivity.UpPicName[16],
			MainActivity.UpPicName[17],
			MainActivity.UpPicName[18],
			MainActivity.UpPicName[19],
			MainActivity.UpPicName[20],
			MainActivity.UpPicName[21],
			MainActivity.UpPicName[22],
			MainActivity.UpPicName[23],
			MainActivity.UpPicName[24],
			MainActivity.UpPicName[25],
			MainActivity.UpPicName[26],
			MainActivity.UpPicName[27],
			MainActivity.UpPicName[28],
			MainActivity.UpPicName[29],
			MainActivity.UpPicName[30],
			MainActivity.UpPicName[31],
			MainActivity.UpPicName[32],
			MainActivity.UpPicName[33],
			MainActivity.UpPicName[34],
			MainActivity.UpPicName[35],
			MainActivity.UpPicName[36],
			MainActivity.UpPicName[37],
			MainActivity.UpPicName[38],
			MainActivity.UpPicName[39]};
	
	String UpPInfo[] = {
			null,
			MainActivity.UpPicinfo[1],
			MainActivity.UpPicinfo[2],
			MainActivity.UpPicinfo[3],
			MainActivity.UpPicinfo[4],
			MainActivity.UpPicinfo[5],
			MainActivity.UpPicinfo[6],
			MainActivity.UpPicinfo[7],
			MainActivity.UpPicinfo[8],
			MainActivity.UpPicinfo[9],
			MainActivity.UpPicinfo[10],
			MainActivity.UpPicinfo[11],
			MainActivity.UpPicinfo[12],
			MainActivity.UpPicinfo[13],
			MainActivity.UpPicinfo[14],
			MainActivity.UpPicinfo[15],
			MainActivity.UpPicinfo[16],
			MainActivity.UpPicinfo[17],
			MainActivity.UpPicinfo[18],
			MainActivity.UpPicinfo[19],
			MainActivity.UpPicinfo[20],
			MainActivity.UpPicinfo[21],
			MainActivity.UpPicinfo[22],
			MainActivity.UpPicinfo[23],
			MainActivity.UpPicinfo[24],
			MainActivity.UpPicinfo[25],
			MainActivity.UpPicinfo[26],
			MainActivity.UpPicinfo[27],
			MainActivity.UpPicinfo[28],
			MainActivity.UpPicinfo[29],};

	
	
	RelativeLayout relativeLayout=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showpc);

        setinfo();
  
    }

    public void setinfo() {



    if(i>0) {
    	textView = (TextView) findViewById(R.id.text1); 
    	textView.setText(UpPInfo[i]);

	if (UpPName[i]!=null)
	{
		File p = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),UpPName[i]);
        Bitmap bitmap = null;
	try {
		bitmap = BitmapFactory.decodeStream(new FileInputStream(p));
        ImageView img=(ImageView) findViewById(R.id.pic1);
        img.setImageBitmap(bitmap);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}};
	
	if(i>1) {

		textView = (TextView) findViewById(R.id.text2); 
		textView.setText(UpPInfo[i-1]);

		
	if (UpPName[i-1]!=null)
	{
		File p = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),UpPName[i-1]);
        Bitmap bitmap = null;
	try {
		bitmap = BitmapFactory.decodeStream(new FileInputStream(p));
        ImageView img=(ImageView) findViewById(R.id.pic2);
        img.setImageBitmap(bitmap);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}};
	
	if(i>2) {

		textView = (TextView) findViewById(R.id.text3); 
		textView.setText(UpPInfo[i-2]);

	if (UpPName[i-2]!=null)
	{
		File p = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),UpPName[i-2]);
        Bitmap bitmap = null;
	try {
		bitmap = BitmapFactory.decodeStream(new FileInputStream(p));
        ImageView img=(ImageView) findViewById(R.id.pic3);
        img.setImageBitmap(bitmap);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}};
	
	if(i>3) {

		textView = (TextView) findViewById(R.id.text4); 
		textView.setText(UpPInfo[i-3]);
	if (UpPName[i-3]!=null)
	{
		File p = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),UpPName[i-3]);
        Bitmap bitmap = null;
	try {
		bitmap = BitmapFactory.decodeStream(new FileInputStream(p));
        ImageView img=(ImageView) findViewById(R.id.pic4);
        img.setImageBitmap(bitmap);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}};
	
	/////////////////////////////////////////

//	textView = (TextView) findViewById(R.id.text1); 
//	textView.setText(UpPInfo[i]);
//	textView = (TextView) findViewById(R.id.text2); 
//	textView.setText(UpPInfo[i-1]);
//	textView = (TextView) findViewById(R.id.text3); 
//	textView.setText(UpPInfo[i-2]);
//	textView = (TextView) findViewById(R.id.text4); 
//	textView.setText(UpPInfo[i-3]);

    }
    
    

    
    public void merge() {
    	

        new Thread(new Runnable() {
            @Override
            public void run() {


                try {

                    String url="https://ss0.baidu.com/94o3dSag_xI4khGko9WTAnF6hhy/image/h%3D300/sign=a62e824376d98d1069d40a31113eb807/838ba61ea8d3fd1fc9c7b6853a4e251f94ca5f46.jpg";
                	Bitmap bitmap = getBitmapFromServer(url);
                   // Bitmap newBmp = newBitmap(bitmap1, bitmap2);
                   //showSharePicture(newBmp);	//PC
                    File p3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "OK-test.jpg");
                    if (!p3.exists())
                        p3.createNewFile();
                    save(bitmap, p3, Bitmap.CompressFormat.JPEG, true);
            		Bitmap bit = BitmapFactory.decodeStream(new FileInputStream(p3));
                    ImageView img=(ImageView) findViewById(R.id.pic1);
                    img.setImageBitmap(bit);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    
    
    
    
    /**
     * 保存图片到文件File。
     *
     * @param src     源图片
     * @param file    要保存到的文件
     * @param format  格式
     * @param recycle 是否回收
     * @return true 成功 false 失败
     */
    public static boolean save(Bitmap src, File file, Bitmap.CompressFormat format, boolean recycle) {
        if (isEmptyBitmap(src))
            return false;
 
        OutputStream os;
        boolean ret = false;
        try {
            os = new BufferedOutputStream(new FileOutputStream(file));
            ret = src.compress(format, 100, os);
            if (recycle && !src.isRecycled())
                src.recycle();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        return ret;
    }

    
    /**
     * Bitmap对象是否为空。
     */
    public static boolean isEmptyBitmap(Bitmap src) {
        return src == null || src.getWidth() == 0 || src.getHeight() == 0;
    }
    
    
    //从服务器取图片 
	public static Bitmap getBitmapFromServer(String imagePath) {
		
		HttpGet get = new HttpGet(imagePath);
		HttpClient client = new DefaultHttpClient();
		Bitmap pic = null;
		try {
			HttpResponse response = client.execute(get);
			HttpEntity entity = response.getEntity();
			InputStream is = entity.getContent();
			
			pic = BitmapFactory.decodeStream(is);   // 关键是这句代码
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pic;
	}
    
    
    
}