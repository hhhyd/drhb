import request from '@/utils/request'

// 查询AQI检测网格员详细信息列表
export function listInspector(query) {
  return request({
    url: '/system/inspector/list',
    method: 'get',
    params: query
  })
}

// 查询AQI检测网格员详细信息详细
export function getInspector(inspectorId) {
  return request({
    url: '/system/inspector/' + inspectorId,
    method: 'get'
  })
}

// 新增AQI检测网格员详细信息
export function addInspector(data) {
  return request({
    url: '/system/inspector',
    method: 'post',
    data: data
  })
}

// 修改AQI检测网格员详细信息
export function updateInspector(data) {
  return request({
    url: '/system/inspector',
    method: 'put',
    data: data
  })
}

// 删除AQI检测网格员详细信息
export function delInspector(inspectorId) {
  return request({
    url: '/system/inspector/' + inspectorId,
    method: 'delete'
  })
}
