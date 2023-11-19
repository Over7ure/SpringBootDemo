package cn.edu.zjut.service;

import cn.edu.zjut.entity.UserFile;

import java.util.List;

public interface UserFileService {
    List<UserFile> queryByUserId(Integer id, Integer page, Integer limit);

    void save(UserFile userFile);

    UserFile queryByUserFileId(Integer id);

    void update(UserFile userFile);

    void delete(Integer id);

    int queryFileCounts(Integer id);
}
