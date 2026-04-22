import request from '@/utils/request'

// 查询系统网格覆盖省区域列表
export function listProvince(query) {
  return request({
    url: '/system/province/list',
    method: 'get',
    params: query
  })
}

// 查询系统网格覆盖省区域详细
export function getProvince(provinceId) {
  return request({
    url: '/system/province/' + provinceId,
    method: 'get'
  })
}

// 新增系统网格覆盖省区域
export function addProvince(data) {
  return request({
    url: '/system/province',
    method: 'post',
    data: data
  })
}

// 修改系统网格覆盖省区域
export function updateProvince(data) {
  return request({
    url: '/system/province',
    method: 'put',
    data: data
  })
}

// 删除系统网格覆盖省区域
export function delProvince(provinceId) {
  return request({
    url: '/system/province/' + provinceId,
    method: 'delete'
  })
}
