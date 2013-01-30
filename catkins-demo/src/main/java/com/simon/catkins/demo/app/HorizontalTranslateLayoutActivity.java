package com.simon.catkins.demo.app;

import android.os.Bundle;
import android.view.View;
import com.simon.catkins.app.BaseActivity;
import com.simon.catkins.demo.R;
import com.simon.catkins.views.HorizontalTranslateLayout;

/**
 */
public class HorizontalTranslateLayoutActivity extends BaseActivity {
  private static final String TAG = "HorizontalTranslateLayoutActivity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.horizontal_translate_layout_demo);
    getTitleBar().setTitle(TAG);

    findViewById(android.R.id.button1).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        ((HorizontalTranslateLayout)findViewById(R.id.container)).dump();
      }
    });
  }
}