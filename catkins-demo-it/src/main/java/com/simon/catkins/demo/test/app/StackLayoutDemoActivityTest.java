/*
 * Copyright (c) 2012. All rights reserved by bb.simon.yu@gmail.com
 */

package com.simon.catkins.demo.test.app;

import android.test.ActivityInstrumentationTestCase2;
import com.simon.catkins.demo.app.StackLayoutDemoActivity;

/**
 * @author bb.simon.yu@gmail.com
 */
public class StackLayoutDemoActivityTest
    extends ActivityInstrumentationTestCase2<StackLayoutDemoActivity> {

  public StackLayoutDemoActivityTest() {
    super(StackLayoutDemoActivity.class);
  }

  public void testActivity() {
    StackLayoutDemoActivity activity = getActivity();
    assertNotNull(activity);
  }
}