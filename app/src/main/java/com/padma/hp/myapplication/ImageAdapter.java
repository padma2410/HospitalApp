package com.padma.hp.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;






    public class ImageAdapter extends BaseAdapter {
        private Context context;

        public Integer[] images = {R.drawable.pic1, R.drawable.pic_2, R.drawable.pic_3,
                R.drawable.pic_4, R.drawable.pic_5, R.drawable.pic_6, R.drawable.pic_7,
                R.drawable.pic_8, R.drawable.pic_9, R.drawable.pic10, R.drawable.pic11,
               // R.drawable.pic12, R.drawable.pic13, R.drawable.pic14, R.drawable.pic15,
               // R.drawable.pic16, R.drawable.pic17, R.drawable.pic18, R.drawable.pic19
        };

        public ImageAdapter(Context c) {
            context = c;
        }

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return images[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(images[position]);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setLayoutParams(new GridView.LayoutParams(280, 280));
            return imageView;
        }
    }
