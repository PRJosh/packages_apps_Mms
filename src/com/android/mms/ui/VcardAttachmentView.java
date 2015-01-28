/*
 * Copyright (c) 2014, The Linux Foundation. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
       * Redistributions of source code must retain the above copyright
         notice, this list of conditions and the following disclaimer.
       * Redistributions in binary form must reproduce the above
         copyright notice, this list of conditions and the following
         disclaimer in the documentation and/or other materials provided
         with the distribution.
       * Neither the name of The Linux Foundation nor the names of its
         contributors may be used to endorse or promote products derived
         from this software without specific prior written permission.

   THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED
   WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
   MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT
   ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS
   BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
   CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
   SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
   BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
   WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
   OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
   IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.android.mms.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.mms.R;

import java.util.Map;

public class VcardAttachmentView extends LinearLayout implements
        SlideViewInterface {

    private TextView mNameView;
    private Button mViewButton;

    public VcardAttachmentView(Context context) {
        super(context);
    }

    public VcardAttachmentView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        mNameView = (TextView) findViewById(R.id.vcard_name);
        mViewButton = (Button) findViewById(R.id.view_vcard_button);
    }

    @Override
    public void setVcard(Uri lookupUri, String name) {
        synchronized (this) {
            if (lookupUri != null && !TextUtils.isEmpty(lookupUri.toString())) {
                mViewButton.setText(R.string.view);
            } else {
                mViewButton.setText(R.string.import_vcard);
            }
        }

        mNameView.setText(name);
    }

    @Override
    public void setVCal(Uri vcalUri, String name) {

    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub

    }

    @Override
    public void setVisibility(boolean visible) {
    }

    @Override
    public void setImage(String name, Bitmap bitmap) {
    }

    @Override
    public void setImageRegionFit(String fit) {
    }

    @Override
    public void setImageVisibility(boolean visible) {
    }

    @Override
    public void setVideo(String name, Uri video) {
    }

    @Override
    public void setVideoVisibility(boolean visible) {
    }

    @Override
    public void startVideo() {
    }

    @Override
    public void stopVideo() {
    }

    @Override
    public void pauseVideo() {
    }

    @Override
    public void seekVideo(int seekTo) {
    }

    @Override
    public void setAudio(Uri audio, String name, Map<String, ?> extras) {
    }

    @Override
    public void startAudio() {
    }

    @Override
    public void stopAudio() {
    }

    @Override
    public void pauseAudio() {
    }

    @Override
    public void seekAudio(int seekTo) {
    }

    @Override
    public void setText(String name, String text) {
    }

    @Override
    public void setTextVisibility(boolean visible) {
    }

    @Override
    public void setVideoThumbnail(String name, Bitmap bitmap) {
    }

}