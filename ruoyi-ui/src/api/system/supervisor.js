import request from '@/utils/request'

// 查询公众监督员详细信息列表
export function listSupervisor(query) {
  return request({
    url: '/system/supervisor/list',
    method: 'get',
    params: query
  })
}

// 查询公众监督员详细信息详细
export function getSupervisor(supervisorId) {
  return request({
    url: '/system/supervisor/' + supervisorId,
    method: 'get'
  })
}

// 新增公众监督员详细信息
export function addSupervisor(data) {
  return request({
    url: '/system/supervisor',
    method: 'post',
    data: data
  })
}

// 修改公众监督员详细信息
export function updateSupervisor(data) {
  return request({
    url: '/system/supervisor',
    method: 'put',
    data: data
  })
}

// 删除公众监督员详细信息
export function delSupervisor(supervisorId) {
  return request({
    url: '/system/supervisor/' + supervisorId,
    method: 'delete'
  })
}
