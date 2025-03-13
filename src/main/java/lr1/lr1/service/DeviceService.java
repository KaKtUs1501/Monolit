package lr1.lr1.service;

import lr1.lr1.model.Device;
import lr1.lr1.repository.DeviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {
    private final DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    public Optional<Device> getDeviceById(Long id) {
        return deviceRepository.findById(id);
    }

    public Device createDevice(Device device) {
        return deviceRepository.save(device);
    }


    public void deleteDevice(Long id) {
        deviceRepository.deleteById(id);
    }
}
