/*
Copyright 2017 yangchong211（github.com/yangchong211）

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.ns.yc.yccustomtextlib.edit.inter;

import android.view.View;

/**
 * <pre>
 *     @author yangchong
 *     blog  : https://github.com/yangchong211/YCStatusBar
 *     time  : 2017/5/18
 *     desc  : 文本+图片数量监听事件接口
 *     revise:
 * </pre>
 */
public interface OnHyperChangeListener {
    /**
     * 文本+图片数量监听
     * @param contentLength         文字长度
     * @param imageLength           图片数量
     */
    void onImageClick(int contentLength, int imageLength);

}
