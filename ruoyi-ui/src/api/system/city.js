import request from '@/utils/request'

// 查询系统网格覆盖市区域列表
export function listCity(query) {
  return request({
    url: '/system/city/list',
    method: 'get',
    params: query
  })
}

// 查询系统网格覆盖市区域详细
export function getCity(cityId) {
  return request({
    url: '/system/city/' + cityId,
    method: 'get'
  })
}

// 新增系统网格覆盖市区域
export function addCity(data) {
  return request({
    url: '/system/city',
    method: 'post',
    data: data
  })
}

// 修改系统网格覆盖市区域
export function updateCity(data) {
  return request({
    url: '/system/city',
    method: 'put',
    data: data
  })
}

// 删除系统网格覆盖市区域
export function delCity(cityId) {
  return request({
    url: '/system/city/' + cityId,
    method: 'delete'
  })
}
