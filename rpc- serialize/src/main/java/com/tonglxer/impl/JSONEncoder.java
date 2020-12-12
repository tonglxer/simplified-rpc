package com.tonglxer.impl;

import com.alibaba.fastjson.JSON;
import com.tonglxer.Encoder;

/**
 * 基于json的序列化实现
 *
 * @Author Tong LinXing
 * @date 2020/12/12
 */
public class JSONEncoder implements Encoder {
    @Override
    public byte[] encode(Object object) {
        return JSON.toJSONBytes(object);
    }
}
