package com.ruoyi.iot.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.iot.mapper.DeviceUserMapper;
import com.ruoyi.iot.domain.DeviceUser;
import com.ruoyi.iot.service.IDeviceUserService;

/**
 * 设备用户Service业务层处理
 * 
 * @author kerwincui
 * @date 2021-12-16
 */
@Service
public class DeviceUserServiceImpl implements IDeviceUserService 
{
    @Autowired
    private DeviceUserMapper deviceUserMapper;

    /**
     * 查询设备用户
     * 
     * @param deviceId 设备用户主键
     * @return 设备用户
     */
    @Override
    public DeviceUser selectDeviceUserByDeviceId(Long deviceId)
    {
        return deviceUserMapper.selectDeviceUserByDeviceId(deviceId);
    }

    /**
     * 查询设备用户列表
     * 
     * @param deviceUser 设备用户
     * @return 设备用户
     */
    @Override
    public List<DeviceUser> selectDeviceUserList(DeviceUser deviceUser)
    {
        return deviceUserMapper.selectDeviceUserList(deviceUser);
    }

    /**
     * 新增设备用户
     * 
     * @param deviceUser 设备用户
     * @return 结果
     */
    @Override
    public int insertDeviceUser(DeviceUser deviceUser)
    {
        deviceUser.setCreateTime(DateUtils.getNowDate());
        deviceUser.setIsOwner(0);
        deviceUser.setLimitCount(10);
        return deviceUserMapper.insertDeviceUser(deviceUser);
    }

    /**
     * 修改设备用户
     * 
     * @param deviceUser 设备用户
     * @return 结果
     */
    @Override
    public int updateDeviceUser(DeviceUser deviceUser)
    {
        deviceUser.setUpdateTime(DateUtils.getNowDate());
        return deviceUserMapper.updateDeviceUser(deviceUser);
    }

    /**
     * 批量删除设备用户
     * 
     * @param deviceIds 需要删除的设备用户主键
     * @return 结果
     */
    @Override
    public int deleteDeviceUserByDeviceIds(Long[] deviceIds)
    {
        return deviceUserMapper.deleteDeviceUserByDeviceIds(deviceIds);
    }

    /**
     * 删除设备用户信息
     * 
     * @param deviceId 设备用户主键
     * @return 结果
     */
    @Override
    public int deleteDeviceUserByDeviceId(Long deviceId)
    {
        return deviceUserMapper.deleteDeviceUserByDeviceId(deviceId);
    }
}
